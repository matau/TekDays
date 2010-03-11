package at.isong

import grails.test.*

class TaskTests extends GrailsUnitTestCase {
    protected void setUp() {
        super.setUp()
    }

    protected void tearDown() {
        super.tearDown()
    }

    void testSomething() {
		def event = TekEvent.get(1)
		def tasks = Task.findAllByEventAndCompleted(event, false, [max:5, sort:'dueDate'])
		
		assertEquals 0, tasks.size

		event = TekEvent.get(2)
		tasks = Task.findAllByEventAndCompleted(event, false, [max:5, sort:'dueDate'])
		
		assertEquals 6, tasks.size


    }
}
