package prp_aufgabe4.impl;

import prp_aufgabe4.BoundingBox;
import prp_aufgabe4.Length;

public class BoundingBoxImpl implements BoundingBox
{
	private final Length m_width;
	private final Length m_height;
	private final Length m_depth;

	private BoundingBoxImpl(Length inWidth, Length inHeight, Length inDepth)
	{
		this.m_width = inWidth;
		this.m_height = inHeight;
		this.m_depth = inDepth;
	}

	@Override
	public BoundingBox add(BoundingBox inToAdd)
	{
		return Values.boundingBoxWithDimensions(this.width().add(inToAdd.width()), this.height().add(inToAdd.height()), this.depth().add(inToAdd.depth()));
	}

	@Override
	public BoundingBox sub(BoundingBox inToSub)
	{
		return Values.boundingBoxWithDimensions(this.width().sub(inToSub.width()), this.height().sub(inToSub.height()), this.depth().sub(inToSub.depth()));
	}

	@Override
	public BoundingBox mul(double inToMultiply)
	{
		return Values.boundingBoxWithDimensions(this.width().mul(inToMultiply), this.height().mul(inToMultiply), this.depth().mul(inToMultiply));
	}

	@Override
	public BoundingBox div(double inToDivide)
	{
		return Values.boundingBoxWithDimensions(this.width().div(inToDivide), this.height().div(inToDivide), this.depth().div(inToDivide));
	}

	@Override
	public Length width()
	{
		return this.m_width;
	}

	@Override
	public Length height()
	{
		return this.m_height;
	}

	@Override
	public Length depth()
	{
		return this.m_depth;
	}

	@Override
	public boolean fitsInto(BoundingBox inBox)
	{
		return isBiggerZero(inBox.sub(this));
	}

	private static boolean isBiggerZero(BoundingBox inBox)
	{
		return inBox.width().toM() > 0 && inBox.height().toM() > 0 && inBox.depth().toM() > 0;
	}

	static BoundingBoxImpl valueOf(Length inWidth, Length inHeight, Length inDepth)
	{
		return new BoundingBoxImpl(inWidth, inHeight, inDepth);
	}
}