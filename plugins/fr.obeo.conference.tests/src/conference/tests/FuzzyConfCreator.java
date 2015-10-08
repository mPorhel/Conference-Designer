package conference.tests;

import java.io.IOException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

import conference.Conference;
import conference.ConferenceFactory;
import conference.Track;

public class FuzzyConfCreator {

	public static void main(String[] args) throws IOException {

		// Initialize model
		ConferenceFactory confFac = ConferenceFactory.eINSTANCE;
		Conference conf = confFac.createConference();
		for (int i = 0; i < 20; i++) {
			Track track = confFac.createTrack();
			track.setName("bla bla N°" + i);		
		}
		
		// Save it in a file
		URI uri = URI.createPlatformResourceURI("/fr.obeo.conference.tests/test.conference", true);
		ResourceSet rs = new ResourceSetImpl();
		Resource res = rs.createResource(uri);
		res.getContents().add(conf);
		res.save(null);		
	}
	
	

}
