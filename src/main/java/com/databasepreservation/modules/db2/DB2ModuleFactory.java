package com.databasepreservation.modules.db2;

import com.databasepreservation.cli.Parameter;
import com.databasepreservation.cli.Parameters;
import com.databasepreservation.modules.DatabaseExportModule;
import com.databasepreservation.modules.DatabaseImportModule;
import com.databasepreservation.modules.DatabaseModuleFactory;
import com.databasepreservation.modules.db2.in.DB2JDBCImportModule;
import com.databasepreservation.modules.db2.out.DB2JDBCExportModule;

import javax.naming.OperationNotSupportedException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Bruno Ferreira <bferreira@keep.pt>
 */
public class DB2ModuleFactory implements DatabaseModuleFactory {
        private static final Parameter hostname = new Parameter().shortName("h").longName("hostname")
          .description("the host name of Db2 Server").hasArgument(true).setOptionalArgument(false).required(true);

        private static final Parameter portNumber = new Parameter().shortName("pn").longName("port-number")
          .description("the port that the Db2 server is listening").hasArgument(true).setOptionalArgument(false)
          .required(true);

        private static final Parameter database = new Parameter().shortName("db").longName("database")
          .description("the name of the database to import from").hasArgument(true).setOptionalArgument(false)
          .required(true);

        private static final Parameter username = new Parameter().shortName("u").longName("username")
          .description("the name of the user to use in connection").hasArgument(true).setOptionalArgument(false)
          .required(true);

        private static final Parameter password = new Parameter().shortName("p").longName("password")
          .description("the password of the user to use in connection").hasArgument(true).setOptionalArgument(false)
          .required(true);

        @Override public boolean producesImportModules() {
                return true;
        }

        @Override public boolean producesExportModules() {
                return true;
        }

        @Override public String getModuleName() {
                return "DB2JDBC";
        }

        @Override public Map<String, Parameter> getAllParameters() {
                HashMap<String, Parameter> parameterHashMap = new HashMap<String, Parameter>();
                parameterHashMap.put(hostname.longName(), hostname);
                parameterHashMap.put(database.longName(), database);
                parameterHashMap.put(username.longName(), username);
                parameterHashMap.put(password.longName(), password);
                parameterHashMap.put(portNumber.longName(), portNumber);
                return parameterHashMap;
        }

        @Override public Parameters getImportModuleParameters() throws OperationNotSupportedException {
                return new Parameters(Arrays.asList(hostname, database, username, password, portNumber), null);
        }

        @Override public Parameters getExportModuleParameters() throws OperationNotSupportedException {
                return new Parameters(Arrays.asList(hostname, database, username, password, portNumber), null);
        }

        @Override public DatabaseImportModule buildImportModule(Map<Parameter, String> parameters)
          throws OperationNotSupportedException {
                String pHostname = parameters.get(hostname);
                String pDatabase = parameters.get(database);
                String pUsername = parameters.get(username);
                String pPassword = parameters.get(password);
                Integer pPortNumber = Integer.parseInt(parameters.get(portNumber));

                return new DB2JDBCImportModule(pHostname, pPortNumber, pDatabase, pUsername, pPassword);
        }

        @Override public DatabaseExportModule buildExportModule(Map<Parameter, String> parameters)
          throws OperationNotSupportedException {
                String pHostname = parameters.get(hostname);
                String pDatabase = parameters.get(database);
                String pUsername = parameters.get(username);
                String pPassword = parameters.get(password);
                Integer pPortNumber = Integer.parseInt(parameters.get(portNumber));

                return new DB2JDBCExportModule(pHostname, pPortNumber, pDatabase, pUsername, pPassword);
        }
}