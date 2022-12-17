package english.phrasesets;

/**
 * This phraseset class will be automatically populated with data from the 
 * phraseset project file.  Manual edits should only be outside of the tag 
 * areas or overridden methods. 
 * Class created on: 
 * Last generated by Orchestration Designer at: 2022-DEC-17  05:51:38 PM
 */
public class BookingDetailsSpeak extends com.avaya.sce.runtime.Phraseset { 

	//{{START:CLASS:FIELDS
	private static final com.avaya.sce.runtime.Phraseset.PhraseMap PHRASE_MAP;
	//}}END:CLASS:FIELDS

	/**
	 * Static initializer
	 */
	static {
		//{{START:PHRASESET:STATIC

		// Create the phrase map, then populate with phrases
		PHRASE_MAP = new com.avaya.sce.runtime.Phraseset.PhraseMap(8);
		com.avaya.sce.runtime.Phrase phrase;

		// phrase: BookingNoIs
		com.avaya.sce.runtime.Phraseset.addLocalPhrase(PHRASE_MAP, "BookingNoIs", "EnterBookingNo.wav", ""); 

		// phrase: NoOfPersonsIs
		com.avaya.sce.runtime.Phraseset.addLocalPhrase(PHRASE_MAP, "NoOfPersonsIs", "NoOfPersonsIs.wav", ""); 

		// phrase: DateAndTimeIs
		com.avaya.sce.runtime.Phraseset.addLocalPhrase(PHRASE_MAP, "DateAndTimeIs", "BookingDateAndTimeIs.wav", ""); 

		// phrase: BookingDurationIs
		com.avaya.sce.runtime.Phraseset.addLocalPhrase(PHRASE_MAP, "BookingDurationIs", "DurationIs.wav", ""); 

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
	 * Last generated by Orchestration Designer at: 2022-DEC-17  05:53:17 PM
	 * @see com.avaya.sce.runtime.Phraseset#getPhrase(String) 
	 */ 
	public com.avaya.sce.runtime.Phrase getPhrase(String phraseName) {
		return(getPhrase(BookingDetailsSpeak.PHRASE_MAP, phraseName));
	}
}
