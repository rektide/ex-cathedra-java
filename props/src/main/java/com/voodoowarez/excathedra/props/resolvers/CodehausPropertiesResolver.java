package com.voodoowarez.ex-cathedra.props

import com.voodoowarez.excathedra.props.PropertyResolver;
//import org.codehaus.mojo.properties.PropertyResolver;

class CodehausPropertyResolver implements PropertyResolver {

	org.codehaus.mojo.properties.PropertyResolver codehausResolver = new org.codehaus.mojo.properties.PropertyResolver();

	/**
	* Retrieves a property value, replacing values like ${token}
	* using the Properties to look them up.
	*
	* Calls:
	* http://svn.codehaus.org/mojo/trunk/mojo/properties-maven-plugin/src/main/java/org/codehaus/mojo/properties/PropertyResolver.java
	* Which itself is Shamelessly adapted from:
	* http://maven.apache.org/plugins/maven-war-plugin/xref/org/apache/maven/plugin/war/PropertyUtils.html
	*
	* It will leave unresolved properties alone, trying for System
	* properties, and environment variables and implements reparsing
	* (in the case that the value of a property contains a key), and will
	* not loop endlessly on a pair like test = ${test}
	*
	* @param key         property key
	* @param properties  project properties
	* @param environment environment variables
	* @return resolved property value
	* @throws IllegalArgumentException when properties are circularly defined
	*/
	public String getPropertyValue(String key, Properties properties, Properties environment)
	{
		return codehausResolver.getPropertyValue(key, properties, environment)
	}
}
