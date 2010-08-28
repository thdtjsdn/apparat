package flash.geom;

import flash.display.DisplayObject;
import jitb.Require;

/**
 * @author Joa Ebert
 */
public class Transform {
	private ColorTransform _colorTransform = new ColorTransform();

	public ColorTransform colorTransform() { return _colorTransform.clone(); }
	public void colorTransform(final ColorTransform value) {
		Require.nonNull(value);
		_colorTransform = value;
	}

	public Transform $JITBinit(final DisplayObject displayObject) {
		return this;
	}
}