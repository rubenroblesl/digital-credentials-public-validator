package org.oneedtech.inspect.vc;

import org.oneedtech.inspect.test.Sample;

public class Samples {

	public static final class OB30 {					
		public static final class SVG {			
			public final static Sample SIMPLE_JSON_SVG = new Sample("ob30/simple-json.svg", true);
			public final static Sample SIMPLE_JWT_SVG = new Sample("ob30/simple-jwt.svg", true);						
		}
		public static final class JSON {			
			public final static Sample COMPLETE_JSON = new Sample("ob30/complete.json", false);
			public final static Sample SIMPLE_JSON = new Sample("ob30/simple.json", true);
			public final static Sample SIMPLE_JSON_UNKNOWN_TYPE = new Sample("ob30/simple-unknown-type.json", false);
			public final static Sample SIMPLE_JSON_PROOF_ERROR = new Sample("ob30/simple-proof-error.json", false);
			public final static Sample SIMPLE_JSON_EXPIRED = new Sample("ob30/simple-expired.json", false);
			public final static Sample SIMPLE_JSON_ISSUED = new Sample("ob30/simple-issued.json", false);
		}
		public static final class PNG {			
			public final static Sample SIMPLE_JWT_PNG = new Sample("ob30/simple-jwt.png", true);
			public final static Sample SIMPLE_JSON_PNG = new Sample("ob30/simple-json.png", true);						
		}
		public static final class JWT {			
			public final static Sample SIMPLE_JWT = new Sample("ob30/simple.jwt", true);
		}
	}
}
