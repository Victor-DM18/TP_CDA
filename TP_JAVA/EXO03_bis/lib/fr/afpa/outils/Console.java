package fr.afpa.outils;



import java.io.*;

/**
 * Console permet d'effectuer des entr�es sorties en mode CONSOLE sans lever d'exception.<p>
 * Cette classe n'est pas standard et ne peut-�tre utilis�e que dans un contexte p�dagogique, 
 * afin de s'affranchir des difficult�s d'entr�es-sorties sp�cifiques au langage JAVA.
 * Les m�thodes applicables � l'objet statique "in" sont celles d�finies dans la classe Console,
 * par contre sur l'objet statique "out" toutes les m�thodes de la classe PrintStream sont utilisables
 *
 * @author afpa
 * @version 1.1.0 du 30/05/02 pour adaptation aux E/S Linux
 * @see java.io.PrintStream
 */

public final class Console 
{
	/**
	 * Objet statique associ� au flot d'entr�e standard
	 */
	
	public static final Console in = new Console();

	/**
	 * Objet statique associ� au flot de sortie standard
 	 * @see java.io.PrintStream
	 */
	public static final PrintStream out = new PrintStream(System.out, true);

//	private static String separator = System.getProperty("line.separator");
	private static String separator = System.getProperty("line.separator");

			
	/**
	 * Lit une cha�ne de 128 caract�res maximum depuis le flot d'entr�e standard. 
	 * Les caract�res de fin de saisie CRLF sont supprim�s
	 * @return Un objet de classe String correspondant � la cha�ne de caract�res tap�e (except� le terminateur de ligne)
	 * en utilisant le code de la machine sous-jacente. La valeur null est retourn�e en cas d'erreur d'entr�e-sortie
	 * @see java.lang.String
	 */
	public String readLine ()
	{
	 	byte  bArray[] = new byte[255];
	 	//int nb;
		try {
			System.in.read (bArray, 0, bArray.length);
			System.in.skip(System.in.available());    // flush
			String buffer = new String (bArray);
			return buffer.substring(0, buffer.lastIndexOf(separator)); // Supprime le terminateur de ligne
		}
		catch (IOException e) {
			return null;
		}
	}

	/**
	 * Lit un entier de type <b>long</b> depuis le flot d'entr�e standard. 
	 * @return L'entier tap� ou la valeur MIN_VALUE en cas d'erreur de format
	 * @see java.lang.Long
	 */
	public long readLong ()
	{
		try {
			String strValue = this.readLine();
			return (strValue != null && strValue.length() > 0 ) ? Long.parseLong(strValue, 10) : Long.MIN_VALUE;
		}
		catch (NumberFormatException e) {              // lev� par parseLong si strValue n'est pas un entier
			return Long.MIN_VALUE;
		}
	}

	/**
	 * Lit un entier de type <b>int</b> depuis le flot d'entr�e standard. 
	 * @return L'entier tap�. La valeur MAX_VALUE ou MIN_VALUE est retourn�e en cas de d�passement de capacit�.
	 * La valeur MIN_VALUE est retourn�e en cas d'erreur de format.
	 * @see java.lang.Integer
	 */
	public int readInt ()
	{
		long lgValue = this.readLong();
		lgValue = Math.max (Integer.MIN_VALUE, lgValue); 
		lgValue = Math.min (Integer.MAX_VALUE, lgValue); 
		return (int) lgValue;
	}

	/**
	 * Lit un entier de type <b>short</b> depuis le flot d'entr�e standard. 
	 * @return L'entier tap�. La valeur MAX_VALUE ou MIN_VALUE est retourn�e en cas de d�passement de capacit�.
	 * La valeur MIN_VALUE est retourn�e en cas d'erreur de format.
	 * @see java.lang.Short
	 */
	public short readShort ()
	{
		long lgValue = this.readLong();
		lgValue = Math.max (Short.MIN_VALUE, lgValue); 
		lgValue = Math.min (Short.MAX_VALUE, lgValue); 
		return (short) lgValue;
	}

	/**
	 * Lit un entier de type <b>byte</b> depuis le flot d'entr�e standard. 
	 * @return L'entier tap�. La valeur MAX_VALUE ou MIN_VALUE est retourn�e en cas de d�passement de capacit�.
	 * La valeur MIN_VALUE est retourn�e en cas d'erreur de format.
	 * @see java.lang.Byte
	 */
	public byte readByte ()
	{
		long lgValue = this.readLong();
		lgValue = Math.max (Byte.MIN_VALUE, lgValue); 
		lgValue = Math.min (Byte.MAX_VALUE, lgValue); 
		return (byte) lgValue;
	}

	/**
	 * Lit un caract�re de type <b>char</b> depuis le flot d'entr�e standard. Tous les caract�res 
	 * du tampon d'entr�e sont perdus.
	 * @return Le premier caract�re tap�. Le caract�re MIN_VALUE est retourn�e en cas d'erreur de lecture.
	 * @see java.lang.Character
	 */
	public char readChar ()
	{
		String strValue = this.readLine();
		return (strValue != null && strValue.length() > 0 ) ? strValue.charAt(0) : Character.MIN_VALUE;
	}

	/**
	 * Lit un nombre flottant de type <b>double</b> depuis le flot d'entr�e standard. 
	 * @return Le flottant tap� ou NaN en cas d'erreur de saisie
	 * @see java.lang.Double
	 */
	public double readDouble()
	{
		try {
			String strValue = this.readLine();
			return (strValue != null && strValue.length() > 0 ) ? Double.parseDouble(strValue) : Double.NaN;
		}
		catch (NumberFormatException e) {              // lev� par parseDouble si strValue n'est pas un entier
			return Double.NaN;			
		}
	}

	/**
	 * Lit un nombre flottant de type <b>float</b> depuis le flot d'entr�e standard. 
	 * @return Le flottant tap� ou NaN en cas d'erreur de saisie.
	 * La valeur MAX_VALUE ou MIN_VALUE est retourn�e en cas de d�passement de capacit�.
	 * @see java.lang.Float
	 */
	public float readFloat()
	{
		double dbValue = this.readDouble();
		if (dbValue == Double.NaN) return Float.NaN;
		dbValue = Math.max (-Float.MAX_VALUE, dbValue); 
		dbValue = Math.min (Float.MAX_VALUE, dbValue); 
		return (float) dbValue;
	}
}
