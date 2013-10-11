import javax.inject.Provider;

import com.voodoowarez.excathedra.props.resolver.CodehausPropertyResolver;

class Provider implements Provider<PropertyResolver> {
	PropertyResolver get(){
		return new CodehausPropertyResolver();
	}
}
