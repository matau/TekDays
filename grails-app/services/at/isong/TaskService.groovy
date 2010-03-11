package at.isong

class TaskService {

    boolean transactional = true

    def addDefaultTasks(tekEvent) {
		if (tekEvent.tasks?.size()) {
			return
		}
		
		tekEvent.addToTasks new Task(title:'Identify potential venues')
		tekEvent.addToTasks new Task(title:'Get price/availability of venues')
		tekEvent.addToTasks new Task(title:'Compile potential sponsor list')
		tekEvent.addToTasks new Task(title:'Design promotional materials')
		tekEvent.addToTasks new Task(title:'Compile potential advertising avenues')
		tekEvent.addToTasks new Task(title:'Locate swag provider (preferable local)')
		tekEvent.save()
    }
}
