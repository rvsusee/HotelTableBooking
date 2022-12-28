package english.phrasesets;

/**
 * This phraseset class will be automatically populated with data from the 
 * phraseset project file.  Manual edits should only be outside of the tag 
 * areas or overridden methods. 
 * Class created on: 
 * Last generated by Orchestration Designer at: 2022-DEC-07  12:32:45 PM
 */
public class PressEng extends com.avaya.sce.runtime.Phraseset { 

	//{{START:CLASS:FIELDS
	private static final com.avaya.sce.runtime.Phraseset.PhraseMap PHRASE_MAP;
	//}}END:CLASS:FIELDS

	/**
	 * Static initializer
	 */
	static {
		//{{START:PHRASESET:STATIC

		// Create the phrase map, then populate with phrases
		PHRASE_MAP = new com.avaya.sce.runtime.Phraseset.PhraseMap(16);
		com.avaya.sce.runtime.Phrase phrase;

		// phrase: PressOne
		com.avaya.sce.runtime.Phraseset.addLocalPhrase(PHRASE_MAP, "PressOne", "PressOne.wav", "Press One"); 

		// phrase: PressTwo
		com.avaya.sce.runtime.Phraseset.addLocalPhrase(PHRASE_MAP, "PressTwo", "PressTwo.wav", "Press Two"); 

		// phrase: PressThree
		com.avaya.sce.runtime.Phraseset.addLocalPhrase(PHRASE_MAP, "PressThree", "PressThree.wav", "Press Three"); 

		// phrase: PressFour
		com.avaya.sce.runtime.Phraseset.addLocalPhrase(PHRASE_MAP, "PressFour", "PressFour.wav", "Press Four"); 

		// phrase: PressFive
		com.avaya.sce.runtime.Phraseset.addLocalPhrase(PHRASE_MAP, "PressFive", "PressFour.wav", "Press Five"); 

		// phrase: PressNine
		com.avaya.sce.runtime.Phraseset.addLocalPhrase(PHRASE_MAP, "PressNine", "PressNine.wav", "Press Nine"); 

		// phrase: PressZero
		com.avaya.sce.runtime.Phraseset.addLocalPhrase(PHRASE_MAP, "PressZero", "PressZero.wav", "Press Zero"); 

		// phrase: PressEight
		com.avaya.sce.runtime.Phraseset.addLocalPhrase(PHRASE_MAP, "PressEight", "PressEight.wav", "Press Eight"); 

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
	 * Last generated by Orchestration Designer at: 2022-DEC-28  06:25:30 PM
	 * @see com.avaya.sce.runtime.Phraseset#getPhrase(String) 
	 */ 
	public com.avaya.sce.runtime.Phrase getPhrase(String phraseName) {
		return(getPhrase(PressEng.PHRASE_MAP, phraseName));
	}
}
