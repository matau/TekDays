package at.isong

class Task {
	String title
	String notes
	TekUser assignedTo
	Date dueDate
	TekEvent event

	static belongsTo = TekEvent
	
    static constraints = {
		title(blank:false)
		notes(blank:true, nullable:true, maxSize:5000)
		assignedTo(nullable:true)
		dueDate(nullable:true)
    }
}
