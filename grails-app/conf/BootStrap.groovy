import at.isong.*

class BootStrap {
			
     def init = { servletContext ->
		new TekUser(fullName: 'Song Phommahaxay',
			userName: 'song',
			password: 'song',
			email: 'song@isong.at',
			website: 'www.song.at',
			bio: '''bla bla bla
			 	 	bla bla ....'''
			).save()
		
		def event1 = new TekEvent(name: 'Gateway Code Camp',
			city: 'Saint Louise, MO',
			organizer: TekUser.findByFullName('Song Phommahaxay'),
			venue: 'TBD',
			startDate: new Date('9/19/2009'),
			endDate: new Date('9/19/2009'),
			description: '''This is conference will ...
				                ........ '''
		)
		if (!event1.save()) {
			event1.errors.allErrors.each{ error -> 
				println "An error occured with event1: ${error}."
			}
		}
		
		def g1 = TekEvent.findByName('Gateway Code Camp')
		g1.addToVolunteers(new TekUser(fullName: 'Xuewei',
			userName: 'xuewei',
			password: 'xuewei',
			email: 'xuewei@gmx.at',
			website: 'www.x.at',
			bio: 'lasdjfldf'))
		
		g1.addToVolunteers(	new TekUser(fullName: 'test',
				userName: 'test',
				password: 'test',
				email: 'test@gmx.at',
				website: 'www.test.at',
				bio: 'not available'))
		
		g1.addToResponders('z@z.com')		
		g1.addToResponders('y@y.com')		
		g1.addToResponders('w@w.com')		

		g1.save()
	
		def s1 = new Sponsor(name:'Contegix',
			website:'contegix.com',
			description:'blala').save()

		def s2 = new Sponsor(name:'Anecon',
				website:'anecon.com',
				description:'blala').save()
		
		def sp1 = new Sponsorship(event:g1,
			sponsor:s1,
			contributionType:'Other',
			description:'Cool T-Shirts').save()
		
		def sp2 = new Sponsorship(event:g1, sponsor:s2,
			contributionType:'Venue' , description:'Will be paying for the Moscone')
		
		s1.addToSponsorships(sp1)	
		s1.save()
		s2.addToSponsorships(sp2)	
		s2.save()
		g1.addToSponsorships(sp1)
		g1.addToSponsorships(sp2)
		g1.save()
			
     }
     def destroy = {
     }
} 