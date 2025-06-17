package @grace.codegen.defaultPackage@

import groovy.transform.CompileStatic
import grails.boot.Grails
import grails.plugins.metadata.PluginSource

@PluginSource
@CompileStatic
class Application {

    static void main(String[] args) {
        Grails.run(Application, args)
    }

}
