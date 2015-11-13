import com.vserve.edp.sentry.provider.db.service.thrift.*;
import com.vserve.edp.sentry.service.thrift.TSentryResponseStatus;
import org.apache.thrift.TException;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.transport.TFramedTransport;
import org.apache.thrift.transport.TSocket;
import org.apache.thrift.transport.TTransport;

/**
 * Created by Mikhail Baiganov.
 */
public class TestClient {
    public static void main(String[] args) {
        try {
            TTransport transport;

            transport = new TFramedTransport(new TSocket("ec2-184-72-166-25.compute-1.amazonaws.com", 8038));
            transport.open();

            TProtocol protocol = new TBinaryProtocol(transport);
            SentryPolicyService.Client client = new SentryPolicyService.Client(protocol);

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
        request.setRequestorUserName("admin");
        request.setGroupName("Admin");
        TListSentryRolesResponse response;
        try {
            response = client.list_sentry_roles_by_group(request);
        } catch (TException e) {
            e.printStackTrace();
        }
    }
}
