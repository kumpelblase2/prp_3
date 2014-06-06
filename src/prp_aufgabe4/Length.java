package prp_aufgabe4;

/**
 * Created by tim_hagemann on 12.05.2014.
 */
public interface Length extends PhysicalUnit<Length>
{
	public double toM();
	public double toFeet();
	public double toNM();

	public Speed div(TimeDiff inTime);
}
