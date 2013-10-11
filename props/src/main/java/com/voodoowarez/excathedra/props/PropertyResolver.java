package com.voodoowarez.excathedra.props;

/**
* Retrieves a property value, replacing values like ${token}
* using the Properties to look them up.
*/
interface PropertyResolver {
	public String getPropertyValue(String key, Properties properties, Properties environment)
}
