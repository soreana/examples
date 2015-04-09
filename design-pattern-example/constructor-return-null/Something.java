public class Something {
	private Something ( String text ){
		System.out.printf( "I'm borning.%s\n" , text );
	}

	public static Something create( String text ){
		if( text.equals( "something" ) )
			return null ;

		return new Something( text );
	}
}
