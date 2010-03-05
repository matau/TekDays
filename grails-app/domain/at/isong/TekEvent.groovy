package at.isong

class TekEvent {
	String city
	String name
	TekUser organizer
	String venue
	Date startDate
	Date endDate
	String description
	
	static hasMany = [volunteers : TekUser,
		responders : String, 
		sponsorships: Sponsorship,
		tasks:Task,
		messages:Message]
	
	String toString() {
		"$name, $city"
	}
	
    static constraints = {
    	name()
		city() 
		description(maxSize:5000) 
		organizer() 
		venue()
		startDate() 
		endDate()
		sponsorships(nullable:true)
		tasks(nullable:true)
		messages(nullable:true)
	}

}
