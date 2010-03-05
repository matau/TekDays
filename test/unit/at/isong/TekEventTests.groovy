package at.isong

import grails.test.*

class TekEventTests extends GrailsUnitTestCase {
    protected void setUp() {
        super.setUp()
    }

    protected void tearDown() {
        super.tearDown()
    }

    void testToString() {
		def tekEvent = new TekEvent(name: 'Groovy One',
									city: 'San Francisco',
									organizer: [fullName: 'Song'] as TekUser,
									venue: 'Moscone Center',
									startDate: new Date('6/2/2011'),
									endDate: new Date('6/5/2011'),
									description: 'blabla')
									
		assertEquals 'Groovy One, San Francisco', tekEvent.toString()
    }
}
