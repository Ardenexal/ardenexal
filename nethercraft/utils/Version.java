package ardenexal.nethercraft.utils;

public class Version {

	public static int Major = 0;
	public static int Minor = 1;
	public static int Patch = 1;
	public static final String Version = "0.1.0";

	public static String VersionCheck(){
		return String.format("%d.%d.%d", Major, Minor, Patch);
	}
}
