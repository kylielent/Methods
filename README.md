# Title

## Introduction
```
This document details the generation of a java program that uses method 
calls and for loops. This code is managed inside github
where we use the markdown format to present our report.

```

## Outline
```java
//Create the addition game to call methods
//print out method calls
```

## References and Literature
```
Liang, Java, 10th Edition, Page 170 , Listing 5.4
Example how to write the common for loop
for (i = 0 , 1 <10, i++)

Liang, Java, 10th Edition, Page 209, Listing 6.4
Example how to do a void method call
public static void printgrade (double score) {
then you would add a return or you could do if and else statements
```

## Code
```java
import java.util.Scanner;
public class Methods {
	public static void main(String[] args) {
		int score;
		//Call the addition game method
		additiongameMethod();
		
	}
	
	public static void additiongameMethod() {
		System.out.println("Inside the addition game method.");
		int hardness = 5;
		int score = 0;
		int hardnesslevel = 2;
		
		//Set up my for loop to go through the number of rounds
		
		int NumberofRounds = 3;
		for (int roundnumber = 1; 
		roundnumber <= NumberofRounds;
		roundnumber = roundnumber +1){
			System.out.println("Inside the for loop. Round: " + roundnumber);
			boolean isanswercorrect = getandcheckstudentanswer(hardness);
			if (isanswercorrect){
				System.out.print("Your score is " + score + " and is now ");
				score = score + hardness;
				System.out.println(score + "." );
				
				if (roundnumber<NumberofRounds){
					System.out.print("Your hardness was " + hardness + " and is now ");
					if (hardness > 5){
						hardness = hardness / hardnesslevel;
					}
						System.out.println(hardness + ".");
					}
					
				}
			}
				System.out.println("The game is complete.");
				System.out.println("Your final score was " + score);
		}
	
	
	public static boolean getandcheckstudentanswer(int hardness) {
		System.out.println("Inside get and check student answer method.");
		System.out.println("Add two integers together and give an integer back.");
		int number1 = (int)(Math.random () * hardness);
		int number2 = (int)(Math.random () * hardness);
		System.out.println("Add " + number1 + " and " + number2 + ".");
		//Scanner get = new Scanner(System.in);
		//studentanswer = input.nextInt();
		Scanner get = new Scanner(System.in);
		int studentanswer = get.nextInt();
		if(studentanswer == (number1 + number2)){
			System.out.println("Good work, your answer is correct");
			return true;
		}else
			System.out.println("Nice try, but the correct answer was " + (number1 + number2));
		
		return false;
	}
}

```

## Console
```
Inside the addition game method.
Inside the for loop. Round: 1
Inside get and check student answer method.
Add two integers together and give an integer back.
Add 2 and 0.
2
Good work, your answer is correct
Your score is 0 and is now 5.
Your hardness was 5 and is now 5.
Inside the for loop. Round: 2
Inside get and check student answer method.
Add two integers together and give an integer back.
Add 4 and 4.
8
Good work, your answer is correct
Your score is 5 and is now 10.
Your hardness was 5 and is now 5.
Inside the for loop. Round: 3
Inside get and check student answer method.
Add two integers together and give an integer back.
Add 0 and 4.
4
Good work, your answer is correct
Your score is 10 and is now 15.
The game is complete.
Your final score was 15

```

##Command Prompts
```
This is my flashdrive E
C:\Users\LAB>E:

To see the directory, I type dir
E:\>dir

This is the directory of my flashdrive E
 Directory of E:\

10/13/2015  07:36 PM    <DIR>          Workspace
02/06/2015  07:43 AM    <DIR>          College Assignments
02/06/2015  07:43 AM    <DIR>          Senior Pictures
10/05/2015  06:50 PM    <DIR>          IF FOUND, OPEN ME
11/09/2015  09:41 AM    <DIR>          Methods
11/09/2015  09:41 AM    <DIR>          MandLoops
               0 File(s)              0 bytes
               6 Dir(s)   3,584,917,504 bytes free

To choose my workspace I typed, cd and then chose my workspace name
E:\>cd MandLoops

To see the directory, I type dir
E:\MandLoops>dir

This is the directory of E
 Directory of E:\MandLoops

11/09/2015  09:41 AM    <DIR>          .
11/09/2015  09:41 AM    <DIR>          ..
11/09/2015  09:41 AM    <DIR>          .metadata
11/09/2015  09:42 AM    <DIR>          Methods
               0 File(s)              0 bytes
               4 Dir(s)   3,584,917,504 bytes free

To choose the file I type, cd then choose methods
E:\MandLoops>cd Methods

To see the directory of it, I type dir
E:\MandLoops\Methods>dir
 Volume in drive E is STORE N GO
 Volume Serial Number is 0012-D687

This is the directory of my file
 Directory of E:\MandLoops\Methods

11/09/2015  09:42 AM    <DIR>          .
11/09/2015  09:42 AM    <DIR>          ..
11/09/2015  09:42 AM               383 .project
11/09/2015  09:42 AM    <DIR>          src
11/09/2015  09:42 AM    <DIR>          bin
11/09/2015  09:42 AM               232 .classpath
11/09/2015  09:43 AM                12 README.md
               3 File(s)            627 bytes
               4 Dir(s)   3,584,917,504 bytes free

To add what I have worked on I type git add . 
E:\MandLoops\Methods>git add .

To commit the changes I use the commit command
E:\MandLoops\Methods>git commit -m "changed outline in readme"
[kylie1033 9638537] changed outline in readme
 1 file changed, 2 insertions(+), 1 deletion(-)

To push my changes I type git push
E:\MandLoops\Methods>git push
warning: push.default is unset; its implicit value has changed in
Git 2.0 from 'matching' to 'simple'. To squelch this message
and maintain the traditional behavior, use:

  git config --global push.default matching

To squelch this message and adopt the new behavior now, use:

  git config --global push.default simple

When push.default is set to 'matching', git will push local branches
to the remote branches that already exist with the same name.

Since Git 2.0, Git defaults to the more conservative 'simple'
behavior, which only pushes the current branch to the corresponding
remote branch that 'git pull' uses to update the current branch.

See 'git help config' and search for 'push.default' for further information.
(the 'simple' mode was introduced in Git 1.7.11. Use the similar mode
'current' instead of 'simple' if you sometimes use older versions of Git)

This is where I login to my github account with my login and password
Username for 'https://github.com': kylielent
Password for 'https://kylielent@github.com':
Counting objects: 4, done.
Delta compression using up to 4 threads.
Compressing objects: 100% (3/3), done.
Writing objects: 100% (4/4), 352 bytes | 0 bytes/s, done.
Total 4 (delta 2), reused 0 (delta 0)
To https://github.com/kylielent/Methods.git
   5cd0cc8..9638537  kylie1033 -> kylie1033

Since I have worked on my code, I add it again. I am on the kylie1033 branch by the way, not the master. 
E:\MandLoops\Methods>git add .

To commit these changes, I type the commit command and message
E:\MandLoops\Methods>git commit -m "first round of code working."
[kylie1033 fe42b25] first round of code working.
 2 files changed, 29 insertions(+), 14 deletions(-)
 rewrite bin/Methods.class (71%)

To push the changes, I git push 
E:\MandLoops\Methods>git push
warning: push.default is unset; its implicit value has changed in
Git 2.0 from 'matching' to 'simple'. To squelch this message
and maintain the traditional behavior, use:

  git config --global push.default matching

To squelch this message and adopt the new behavior now, use:

  git config --global push.default simple

When push.default is set to 'matching', git will push local branches
to the remote branches that already exist with the same name.

Since Git 2.0, Git defaults to the more conservative 'simple'
behavior, which only pushes the current branch to the corresponding
remote branch that 'git pull' uses to update the current branch.

See 'git help config' and search for 'push.default' for further information.
(the 'simple' mode was introduced in Git 1.7.11. Use the similar mode
'current' instead of 'simple' if you sometimes use older versions of Git)

Here I login to my github accoutn with my password and login
Username for 'https://github.com': kylielent
Password for 'https://kylielent@github.com':
Counting objects: 6, done.
Delta compression using up to 4 threads.
Compressing objects: 100% (4/4), done.
Writing objects: 100% (6/6), 1.95 KiB | 0 bytes/s, done.
Total 6 (delta 1), reused 0 (delta 0)
To https://github.com/kylielent/Methods.git
   9638537..fe42b25  kylie1033 -> kylie1033

Just to  make sure I have everything, I do a git pull
E:\MandLoops\Methods>git pull
remote: Counting objects: 6, done.
remote: Compressing objects: 100% (4/4), done.
remote: Total 6 (delta 1), reused 0 (delta 0), pack-reused 0
Unpacking objects: 100% (6/6), done.
From https://github.com/kylielent/Methods
   c9cf94c..7a96e85  master     -> origin/master
Already up-to-date.

I did a git add just in case
E:\MandLoops\Methods>git add .

I did a commit command and message for my git pull
E:\MandLoops\Methods>git commit -m "did a git pull so i need to readd"
On branch kylie1033
Your branch is up-to-date with 'origin/kylie1033'.
nothing to commit, working directory clean

I did a git push 
E:\MandLoops\Methods>git push
warning: push.default is unset; its implicit value has changed in
Git 2.0 from 'matching' to 'simple'. To squelch this message
and maintain the traditional behavior, use:

  git config --global push.default matching

To squelch this message and adopt the new behavior now, use:

  git config --global push.default simple

When push.default is set to 'matching', git will push local branches
to the remote branches that already exist with the same name.

Since Git 2.0, Git defaults to the more conservative 'simple'
behavior, which only pushes the current branch to the corresponding
remote branch that 'git pull' uses to update the current branch.

See 'git help config' and search for 'push.default' for further information.
(the 'simple' mode was introduced in Git 1.7.11. Use the similar mode
'current' instead of 'simple' if you sometimes use older versions of Git)

I login to github with my account password and name
Username for 'https://github.com': kylielent
Password for 'https://kylielent@github.com':
Everything up-to-date

Since I am done, I will push to master. I checkout of kylie1033 then go to master branch 
E:\MandLoops\Methods>git checkout master
Switched to branch 'master'
Your branch is behind 'origin/master' by 2 commits, and can be fast-forwarded.
  (use "git pull" to update your local branch)

This is the command I use to push to my master
E:\MandLoops\Methods>git push -u origin master

Here I login again.
Username for 'https://github.com': kylielent
Password for 'https://kylielent@github.com':
To https://github.com/kylielent/Methods.git
 ! [rejected]        master -> master (non-fast-forward)
error: failed to push some refs to 'https://github.com/kylielent/Methods.git'
hint: Updates were rejected because the tip of your current branch is behind
hint: its remote counterpart. Integrate the remote changes (e.g.
hint: 'git pull ...') before pushing again.
hint: See the 'Note about fast-forwards' in 'git push --help' for details.

Here I git pull 
E:\MandLoops\Methods>git pull
Updating c9cf94c..7a96e85
Fast-forward
 README.md | 49 ++++++++++++++++++++++++++++++++++++++++++++++++-
 1 file changed, 48 insertions(+), 1 deletion(-)

THen i get add since i am done
E:\MandLoops\Methods>git add .

Here i commit the changes
E:\MandLoops\Methods>git commit -m "all code working."
On branch master
Your branch is up-to-date with 'origin/master'.
nothing to commit, working directory clean

I git push to push my information 
E:\MandLoops\Methods>git push
warning: push.default is unset; its implicit value has changed in
Git 2.0 from 'matching' to 'simple'. To squelch this message
and maintain the traditional behavior, use:

  git config --global push.default matching

To squelch this message and adopt the new behavior now, use:

  git config --global push.default simple

When push.default is set to 'matching', git will push local branches
to the remote branches that already exist with the same name.

Since Git 2.0, Git defaults to the more conservative 'simple'
behavior, which only pushes the current branch to the corresponding
remote branch that 'git pull' uses to update the current branch.

See 'git help config' and search for 'push.default' for further information.
(the 'simple' mode was introduced in Git 1.7.11. Use the similar mode
'current' instead of 'simple' if you sometimes use older versions of Git)

Here I login again.
Username for 'https://github.com': kylielent
Password for 'https://kylielent@github.com':
Everything up-to-date

E:\MandLoops\Methods>git checkout kylie1033
Switched to branch 'kylie1033'
Your branch is up-to-date with 'origin/kylie1033'.

Here it says everything it up to date with mster.
E:\MandLoops\Methods>git checkout master
Switched to branch 'master'
Your branch is up-to-date with 'origin/master'.
```

## Summary
```
The purpose of this assignment was to take what we have learned from method calls and for loops 
and apply it to something we have already done, which is the addition game. 
This time we make it easier to write out the code because instead of copying and pasting
all four rounds we just assign some code to a method call or for loop, or both, 
and make the quiz faster and less tedious.
```
