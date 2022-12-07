package english.phrasesets;

/**
 * This phraseset class will be automatically populated with data from the 
 * phraseset project file.  Manual edits should only be outside of the tag 
 * areas or overridden methods. 
 * Class created on: 
 * Last generated by Orchestration Designer at: 2022-DEC-07  03:28:43 PM
 */
public class EngSubMenu extends com.avaya.sce.runtime.Phraseset { 

	//{{START:CLASS:FIELDS
	private static final com.avaya.sce.runtime.Phraseset.PhraseMap PHRASE_MAP;
	//}}END:CLASS:FIELDS

	/**
	 * Static initializer
	 */
	static {
		//{{START:PHRASESET:STATIC

		// Create the phrase map, then populate with phrases
		PHRASE_MAP = new com.avaya.sce.runtime.Phraseset.PhraseMap(6);
		com.avaya.sce.runtime.Phrase phrase;

		// phrase: ForRepeatBookingDetails
		com.avaya.sce.runtime.Phraseset.addLocalPhrase(PHRASE_MAP, "ForRepeatBookingDetails", "ForAcmtBookingDetails.wav", "For Repeat Booking Details"); 

		// phrase: ForEditBookingDetails
		com.avaya.sce.runtime.Phraseset.addLocalPhrase(PHRASE_MAP, "ForEditBookingDetails", "ForEditBookingDetails.wav", "For Edit Booking Details"); 

		// phrase: ForCancelBookingDetails
		com.avaya.sce.runtime.Phraseset.addLocalPhrase(PHRASE_MAP, "ForCancelBookingDetails", "ForCancelBookingDetails.wav", "For Cancel Booking"); 

		//}}END:PHRASESET:STATIC
	}
	/**
	 * Returns the Phrase with the given name.  To override the
	 * behavior and dynamically return a different Phrase object,
	 * override the method "hookGetPhrase(...)".
	 * 
	 * This method is generated automatically by the code generator
	 * and should not be manually edited.  Manual edits may be overwritten
	 * by the code generator.
	 * Last generated by Orchestration Designer at: 2022-DEC-07  05:21:35 PM
	 * @see com.avaya.sce.runtime.Phraseset#getPhrase(String) 
	 */ 
	public com.avaya.sce.runtime.Phrase getPhrase(String phraseName) {
		return(getPhrase(EngSubMenu.PHRASE_MAP, phraseName));
	}
}
