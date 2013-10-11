package com.voodoowarez.excathedra.props;

import com.voodoowarez.excathedra.props.PropertyResolver;
import com.voodoowarez.excathedra.props.resolver.CodehausPropertyResolver;

//import javax.inject.Provider;

public class Provider implements javax.inject.Provider<PropertyResolver> {
	public PropertyResolver get(){
		return new CodehausPropertyResolver();
	}
}
