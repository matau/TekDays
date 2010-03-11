package at.isong

class TekEvent {
	String city
	String name
	TekUser organizer
	String venue
	Date startDate
	Date endDate
	String description
	
	String twitterId
	String twitterPassword
	
	static searchable = true
	
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
		twitterId(nullable:true)
		twitterPassword(nullable:true)
	}

}
