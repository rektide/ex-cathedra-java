package com.voodoowarez.excathedra.props;

import java.util.Properties;

/**
* Retrieves a property value, replacing values like ${token}
* using the Properties to look them up.
*/
public interface PropertyResolver {
	String getPropertyValue(String key, Properties properties, Properties environment);
}
