package com.liferay.knowledgebase.util;

import com.liferay.portal.model.PortletConstants;

public class PortletKeys extends com.liferay.portal.util.PortletKeys {

	public static final String KNOWLEDGE_BASE_ADMIN =
		"1_WAR_knowledgebaseportlet";

	public static final String KNOWLEDGE_BASE_ARTICLE =
		"3_WAR_knowledgebaseportlet";

	public static final String KNOWLEDGE_BASE_ARTICLE_DEFAULT_INSTANCE =
		PortletKeys.KNOWLEDGE_BASE_ARTICLE +
			PortletConstants.INSTANCE_SEPARATOR + "0000";

	public static final String KNOWLEDGE_BASE_DISPLAY =
		"2_WAR_knowledgebaseportlet";

	public static final String KNOWLEDGE_BASE_SEARCH =
		"5_WAR_knowledgebaseportlet";

	public static final String KNOWLEDGE_BASE_SECTION =
		"4_WAR_knowledgebaseportlet";

}
