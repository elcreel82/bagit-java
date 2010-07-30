package gov.loc.repository.bagit.v0_96;

import gov.loc.repository.bagit.BagFactory.Version;
import gov.loc.repository.bagit.impl.AbstractBagImplTest;

public class BagWithLeadingDotSlashInManifestTests extends AbstractBagImplTest {

	@Override
	public Version getVersion() {
		return Version.V0_96;
	}
	
	@Override
	protected String getBagName() {
		return "bag-with-leading-dot-slash-in-manifest";
	};
}
