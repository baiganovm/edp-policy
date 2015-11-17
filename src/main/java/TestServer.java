import com.vserve.edp.sentry.provider.db.service.thrift.*;
import com.vserve.edp.sentry.service.thrift.TSentryResponseStatus;
import org.apache.thrift.TException;
import org.apache.thrift.TMultiplexedProcessor;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.server.TServer;
import org.apache.thrift.server.TSimpleServer;
import org.apache.thrift.server.TThreadPoolServer;
import org.apache.thrift.transport.TServerSocket;
import org.apache.thrift.transport.TServerTransport;

/**
 * Created by Mikhail Baiganov.
 */
public class TestServer {


        public static SentryPolicyService.Iface handler;

        public static SentryPolicyService.Processor<SentryPolicyService.Iface> processor;

        public static void main(String [] args) {
            try {
                handler = new SentryPolicyService.Iface() {
                    @Override
                    public TCreateSentryRoleResponse create_sentry_role(TCreateSentryRoleRequest request) throws TException {
                        return null;
                    }

                    @Override
                    public TDropSentryRoleResponse drop_sentry_role(TDropSentryRoleRequest request) throws TException {
                        return null;
                    }

                    @Override
                    public TAlterSentryRoleGrantPrivilegeResponse alter_sentry_role_grant_privilege(TAlterSentryRoleGrantPrivilegeRequest request) throws TException {
                        return null;
                    }

                    @Override
                    public TAlterSentryRoleRevokePrivilegeResponse alter_sentry_role_revoke_privilege(TAlterSentryRoleRevokePrivilegeRequest request) throws TException {
                        return null;
                    }

                    @Override
                    public TAlterSentryRoleAddGroupsResponse alter_sentry_role_add_groups(TAlterSentryRoleAddGroupsRequest request) throws TException {
                        return null;
                    }

                    @Override
                    public TAlterSentryRoleDeleteGroupsResponse alter_sentry_role_delete_groups(TAlterSentryRoleDeleteGroupsRequest request) throws TException {
                        return null;
                    }

                    @Override
                    public TListSentryRolesResponse list_sentry_roles_by_group(TListSentryRolesRequest request) throws TException {

                        TListSentryRolesResponse response = new TListSentryRolesResponse();
                        response.setStatus(new TSentryResponseStatus(1,"Server call to client"));
                        return response;
                    }

                    @Override
                    public TListSentryPrivilegesResponse list_sentry_privileges_by_role(TListSentryPrivilegesRequest request) throws TException {
                        return null;
                    }

                    @Override
                    public TListSentryPrivilegesForProviderResponse list_sentry_privileges_for_provider(TListSentryPrivilegesForProviderRequest request) throws TException {
                        return null;
                    }

                    @Override
                    public TDropPrivilegesResponse drop_sentry_privilege(TDropPrivilegesRequest request) throws TException {
                        return null;
                    }

                    @Override
                    public TRenamePrivilegesResponse rename_sentry_privilege(TRenamePrivilegesRequest request) throws TException {
                        return null;
                    }

                    @Override
                    public TListSentryPrivilegesByAuthResponse list_sentry_privileges_by_authorizable(TListSentryPrivilegesByAuthRequest request) throws TException {
                        return null;
                    }

                    @Override
                    public TSentryConfigValueResponse get_sentry_config_value(TSentryConfigValueRequest request) throws TException {
                        return null;
                    }
                };
                processor = new SentryPolicyService.Processor<SentryPolicyService.Iface>(handler);

                /*Runnable simple = new Runnable() {
                    public void run() {
                        simple(processor);
                    }
                };*/

                /*Thread thread = new Thread(simple);
                thread.start();*/
                TestServer server = new TestServer();
                server.start();
            } catch (Exception x) {
                x.printStackTrace();
            }
        }

    private void start() {
        RunThread thread = new RunThread();
        thread.start();
    }

    public class RunThread extends Thread{
            @Override
            public void run() {
                try {
                    TMultiplexedProcessor processorM = new TMultiplexedProcessor();
                    processorM.registerProcessor("Sentry-Service", processor);

                    TServerTransport serverTransport = new TServerSocket(9090);
                    TBinaryProtocol.Factory prot = new TBinaryProtocol.Factory(true, true);
                    //TThreadPoolServer server = new TThreadPoolServer(new TThreadPoolServer.Args(serverTransport).processor(processorM));
                    TServer server;
                    //server = new TSimpleServer(new TSimpleServer.Args(serverTransport).processor(processorM));
                    server = new TThreadPoolServer(new TThreadPoolServer.Args(serverTransport).outputProtocolFactory(prot).processor(processorM));

                    System.out.println("Starting the simple server...");
                    server.serve();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        public static void simple(SentryPolicyService.Processor<SentryPolicyService.Iface> processor) {
            try {
                TServerTransport serverTransport = new TServerSocket(8038);
                TServer server = new TSimpleServer(new TServer.Args(serverTransport).processor(processor));

                System.out.println("Starting the simple server...");
                server.serve();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }

