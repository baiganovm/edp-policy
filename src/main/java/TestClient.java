import com.vserve.edp.sentry.provider.db.service.thrift.*;
import com.vserve.edp.sentry.service.thrift.TSentryResponseStatus;
import org.apache.thrift.TException;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.protocol.TMultiplexedProtocol;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.transport.*;

import java.io.IOException;

/**
 * Created by Mikhail Baiganov.
 */
public class TestClient {
    public static void main(String[] args) {
        try {
            TTransport transport;

            transport = new TSocket(/*"localhost"*/"ec2-184-72-166-25.compute-1.amazonaws.com",/*9090*/ 8038);
            transport.open();
            TProtocol protocol = new TBinaryProtocol(transport);
            TMultiplexedProtocol multiplexedProtocol = new TMultiplexedProtocol(protocol, "SentryPolicyService");
            SentryPolicyService.Client client = new SentryPolicyService.Client(multiplexedProtocol);

            perform(client);

            transport.close();
        } catch (TException x) {
            x.printStackTrace();
        }
    }
    private static void perform(SentryPolicyService.Client client) throws TException
    {
        TListSentryRolesRequest request = new TListSentryRolesRequest();
        request.setProtocol_version(com.vserve.edp.sentry.service.thrift.sentry_common_serviceConstants.TSENTRY_SERVICE_V2);
        request.setRequestorUserName("hue");
        //request.setGroupName("admin1");
        TListSentryRolesResponse response;
        try {
            response = client.list_sentry_roles_by_group(request);
            System.out.println(response);
        } catch (TException e) {
            e.printStackTrace();
        }
    }
}
