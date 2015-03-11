using System;

namespace e3
{
	interface IDrawable : IGeometricObject
	{
		Pen Pen { get; set; }
	}

	interface IGeometricObject
	{

	}
}

