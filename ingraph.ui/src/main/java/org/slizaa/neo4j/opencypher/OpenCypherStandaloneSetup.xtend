/*
 * generated by Xtext 2.12.0
 */
package org.slizaa.neo4j.opencypher


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
class OpenCypherStandaloneSetup extends OpenCypherStandaloneSetupGenerated {

	def static void doSetup() {
		new OpenCypherStandaloneSetup().createInjectorAndDoEMFRegistration()
	}
}