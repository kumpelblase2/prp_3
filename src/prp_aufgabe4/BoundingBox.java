package prp_aufgabe4;

public interface BoundingBox extends PhysicalUnit<BoundingBox>
{
	public Length width();
	public Length height();
	public Length depth();
}