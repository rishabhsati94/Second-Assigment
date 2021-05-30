# Second-Assigment

You are given an array of integers that represents the IDs of the users that have registered in “infostridrebook,” a private social network created for all the students who have learning from infostride intern   programs.
The array of integers has the following properties:
With a known length N
The array is sorted in an ascending order
The array holds distinct integers (i.e. there are no repeating numbers)
The array is 1-indexed, i.e. the first element is stored in A[1] (not A[0])
Find the first positive integer M (where 1 <= M <= N) such that when M is used as the array index, the result from the array is the the integer M itself. i.e. A[M] = M
In other words, find the first positive integer M where M is both a user’s ID and its index in the array of user ids.
Write a program to find M, if it exists, in O(log N) time. If M does not exist, please return NOT_FOUND
