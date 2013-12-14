/*
Make a collection of all time zones returned by java.util.TimeZone.getAvailableIDs
that are in America. Strip off the "America/"prefix and sort the result.
*/

import java.util.TimeZone

val tzlist = TimeZone.getAvailableIDs();
val tzName = "Africa/" 

tzlist filter {_.startsWith(tzName)} map {
		_ drop tzName.length} sortWith{_ < _} foreach {println(_)}
