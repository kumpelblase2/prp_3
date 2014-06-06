package prp_aufgabe4;

/**
 * Created by tim_hagemann on 12.05.2014.
 */
public interface PhysicalUnit<T>
{
	public T add(T inToAdd);
	public T sub(T inToSub);
	public T mul(double inToMultiply);
	public T div(double inToDivide);
}
