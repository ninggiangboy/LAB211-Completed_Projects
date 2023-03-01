## Getting Started

Welcome to the Java_Utils. Here is a some sample classes and methods to help you get started to write Java code for LAB211

## Folder Structure

The workspace contains one folders by default, where:

- `src`: the folder to maintain sources

## Class Structure

# ArrayUtils

This class provides two static methods to work with arrays of integers.

The `generateRandomElement` method will generate random integers between the specified minimum and maximum values and store them in the given array.

The `printArray` method will print the contents of the given array to the console in a formatted string.

# FileUtils

This class provides two static methods to work with files.

The `readTextFile` method will read the content of a file into a single string.

The `writeTextFile` method will write a string to a file.

# Inputted

This class provides methods for validating user input.

The `getByRegex` method will prompt the user for input with the given message, validates the input using the given regular expression, and returns the validated input.

The `inputStringNoBlack` method will prompt the user for input with the given message and validates the input to ensure it contains at least one non-whitespace character.

The `inputIntNumber` method will prompt the user to input an integer number within a given range (inclusive) using regular expression.

The `inputDoubleNumber` method will prompt the user to input an double number within a given range (inclusive) using regular expression.

The `pressYN` method will prompt the user with a message and waits for them to input "y" or "n" (return true), or "yes" or "no" (return false).

The `inputEmail` method will prompt the user with a message and waits for them to input an email address with the format `<account name>@<domain>`.

The `inputPhone` method will prompt the user with a message and waits for them to input an phone number.

# Menu

The `getChoice` method will display a menu of options to the user, prompts them to select an option, and returns their choice as an integer.

The `printMenu` method will print a menu of options to the console, with each option numbered.

# Normalize

The `removeUnnecessaryBlank` method will remove all unnecessary whitespace from the given string by replacing all consecutive whitespace characters with a single space.

The `removeAllBlank` method will remove all whitespace from the given string.

# SearchUtils

The `printResult` method will print the search result to the console.

# SortUtils

The `checkSort` method checks if the given integer array is sorted in increasing or decreasing order, or not sorted at all.
