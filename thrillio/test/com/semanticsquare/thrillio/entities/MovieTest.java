package com.semanticsquare.thrillio.entities;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.semanticsquare.thrillio.constants.MovieGenre;
import com.semanticsquare.thrillio.managers.BookmarkManager;

public class MovieTest {

	@Test
	void testIsKidFriendlyEligible() {
		//Test 1 Horror genre - False
			Movie movie = BookmarkManager.getInstance().createMovie(3000, "Citizen Kane", "", 1941, new String[] {"Orson Welles", "Joseph Cotten"}, new String[] {"Orson Welles"}, MovieGenre.HORROR, 8.5);
			
			boolean isKidFriendlyEligible = movie.isKidFriendlyEligible();
			
			assertFalse(isKidFriendlyEligible, "For Horror Genre  - isKidFriendlyEligible() should return false");
			
		//Test2 thriller genre - False
			movie = BookmarkManager.getInstance().createMovie(3000, "Citizen Kane", "", 1941, new String[] {"Orson Welles", "Joseph Cotten"}, new String[] {"Orson Welles"}, MovieGenre.THRILLERS, 8.5);
			
			isKidFriendlyEligible = movie.isKidFriendlyEligible();
			
			assertFalse(isKidFriendlyEligible, "For Thriller Genre  - isKidFriendlyEligible() should return false");
		
	}

}
