package _46_InnerClass_01;

public class Collection {

	public Object[] values;
	
	// constructor
	public Collection(Object[] values) {
		this.values = values;
	}
	
	public Forward createForward() {
		return new Forward();
	}
	
	// inner class
	public class Forward implements Itarable {
		
		private int pos = 0;
		
		public Forward() {
			
		}

		@Override
		public boolean hasNext() {
			
			return pos < values.length;
		}

		@Override
		public Object getValue() {
			// TODO Auto-generated method stub
			return values[pos++];
		}
		
	}
	
}
