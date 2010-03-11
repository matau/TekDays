package at.isong

class TaskService {

    boolean transactional = true

    def addDefaultTasks(tekEvent) {
		if (tekEvent.tasks?.size()) {
			return
		}
		
		tekEvent.addToTasks new Task(title:'Identify potential venues', completed:false)
		tekEvent.addToTasks new Task(title:'Get price/availability of venues', completed:false)
		tekEvent.addToTasks new Task(title:'Compile potential sponsor list', completed:false)
		tekEvent.addToTasks new Task(title:'Design promotional materials', completed:false)
		tekEvent.addToTasks new Task(title:'Compile potential advertising avenues', completed:false)
		tekEvent.addToTasks new Task(title:'Locate swag provider (preferable local)', completed:false)
		tekEvent.save()
    }
}
