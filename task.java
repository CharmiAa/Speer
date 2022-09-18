import java.io.*;
import java.util.*;

//here var is defined for autometically detect the datatype
var request = require('request');
var cheerio = require('cheerio');
var URL = require('url-parse');

var START_URL = "https://en.wikipedia.org/";
var SEARCH_WORD = "stemming";
int var MAX_PAGES_TO_VISIT = 10;

var pagesVisited = {};
int var numPagesVisited = 0;

ArrayList var pagesToVisit = new ArrayList<>();
var url = new URL(START_URL);
var baseUrl = url.protocol + "//" + url.hostname


pagesToVisit.add(START_URL);
crawl();


public static XXXX crawl(){
	if((numPagesVisited >= MAX_PAGES_TO_VISIT) {
		System.out.println("Reached max limit of number of pages to visit.");
		return;
	}
	var nextPage = pagesToVisit.remove();
	if( pagesVisited.contains(nextPage)) {
		// We've already visited this page, so repeat the crawl
		crawl();
	}else {
		// New page we haven't visited
		visitPage(nextPage, crawl);
	
	}
}
		

public static XXXX visitPage(url, callback){
	// Add page to our set
	pagesVisited.get(url) = true;
	numPagesVisited++;	
	// Make the request
	System.out.println("Visiting page " + url);
	request(url, def(error, response, body);
	// Check status code (200 is HTTP OK)
	System.out.println("Status code: " + response.statusCode);
	if(response.statusCode is not 200:
        	callback()
        	return;
	}
}

// Parse the document body

var $ = cheerio.load(body)
var isWordFound = searchForWord($, SEARCH_WORD);
if((isWordFound) {
	System.out.println('Word ' + SEARCH_WORD + ' found at page ' + url);
}else {
	collectInternalLinks($);
	// In this short program, our callback is just calling crawl()
	callback();
}

public static XXXX searchForWord($, word){
	var bodyText = $('html > body').text().toLowerCase();
	return(bodyText.indexOf(word.toLowerCase()) is not -1)
}

public static XXXX collectInternalLinks($){
	var relativeLinks = $("a.get(href^='/') ");
	System.out.println("Found " + relativeLinks.length + " relative links on page");
	relativeLinks.each(def(){
		pagesToVisit.add(baseUrl + $(this).attr('href'));
	}
}






