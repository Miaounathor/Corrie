package org.handrianj.corrie.viewsmanager.perspectives;

import org.handrianj.corrie.viewsmanager.ui.AbstractCorriePerspectiveFactory;

/**
 * Configures the perspective layout. This class is contributed through the
 * plugin.xml.
 */
public class DefaultEmptyPerspective extends AbstractCorriePerspectiveFactory {

	public static final String ID = "org.handrianj.corrie.viewsmanager.perspectives.DefaultEmptyPerspective";

	@Override
	protected String getID() {
		return ID;
	}
}
