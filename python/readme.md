# Computer Science II
## Lab 1.0 - Introduction - Python Version
[School of Computing](https://computing.unl.edu)  
[College of Engineering](https://engineering.unl.edu/)  
[University of Nebraska-Lincoln](https://unl.edu)  
[University of Nebraska-Omaha](https://unomaha.edu)  

An introduction to the Python programming language and tools.

## Overview

### Prior to Lab

In each lab there may be pre-lab activities that you are *required*
to complete prior to attending lab.  Failure to do so may mean that
you will not be given full credit for the lab.

### Lab Objectives & Topics

Following the lab, you should be able to:
* Receive and activate your CSE account and log into the network
  using a Windows machine and your CSE account.
* Clone projects from GitHub using Eclipse
* Open, compile, and execute a given Java program in Eclipse.
* Write a simple program in the Eclipse IDE, compile, and
  execute that program.

### Peer Programming Pair-Up

To encourage collaboration and a team environment, labs will be
structured in a *pair programming* setup.  At the start of
each lab, you may be randomly paired up with another student by
a lab instructor.  One of you will be designated the *driver*
and the other the *navigator*.

The navigator will be responsible for reading the instructions
and telling the driver what is to be done.  The driver will be
in charge of the keyboard and workstation.  Both driver and
navigator are responsible for suggesting fixes and solutions
*together*.  Neither the navigator nor the driver is "in charge."
Beyond your immediate pairing, you are encouraged to help and
interact and with other pairs in the lab.

Each week you should try to alternate: if you were a driver
last week, be a navigator next, etc.  Resolve any issues (you
were both drivers last week) within your pair.  Ask the lab
instructor to resolve issues only when you cannot come to a
consensus.

Because of the peer programming setup of labs, it is absolutely
essential that you complete any pre-lab activities and familiarize
yourself with the handouts prior to coming to lab.  Failure to do
so will negatively impact your ability to collaborate and work with
others which may mean that you will not be able to complete the
lab.

## 1. Getting Started

### 1.1. Setup

#### 1.1.1. Java

The Java version of this lab runs you through a setup and installation
of the Java Virtual Machine (JVM) and Java Development Kit (JDK) that
are necessary for all students later in the semester.  It also runs
you through the development, testing, hand in and grading process for
all Java labs and assignments.  All students should complete the Java section, even
if you are already familiar with Java, in order to familiarize yourself
with how labs will work for the semester.

#### 1.1.2. Python

To write and execute Python scripts you'll need an editor and a Python
interpreter.  If you've used the CS50 IDE (a codespaces/VS Code IDE),
we recommend you continue using it for Python development.  Instructions
for getting setup can be found here:

<https://github.com/cbourke/CSCE155-C-Lab01>

Otherwise, there are other Python development IDEs that you can download
and use:

- PyCharm: <https://www.jetbrains.com/pycharm/>
- Visual Studio: <https://code.visualstudio.com/docs/languages/python>

## 2. Cloning Starter Code From Github

Each lab will have some starter code and other *artifacts*
(data files, scripts, etc.) that will be provided for to you.
The code is hosted on Github (<https://github.com>) and you must
*clone* your own copy to work with it.  You will not need to
know the details of using git nor be a registered Github user
to get access to the code necessary for your labs.  However,
you are *highly encouraged* to learn this essential tool.
You may find it very useful to keep track of your own code
and to share code if you work in pairs or groups.

To clone the code for this lab (which includes the Java
version), execute the following command from a terminal:

`git clone https://github.com/cbourke/CSCE156-Lab01`

Change your current working directory to the directory
containing the Python code:

`cd CSCE156-Lab01/python`

# Python

## 3.1 Running & Editing Programs

### 3.1.1 Running a Program

Python is an interpreted language which means you don't compile
source code into an executable program.  Instead, python scripts
are executed using a python interpreter.  To run the interpreter,
we have provided a simple Hello World script, `python.py` (generally,
python scripts have a `.py` extension).

- Open the `hello.py` script and observe its contents: comments in
python begin with a hash, `#` and the `print()` function is used to
output to the standard output.
- From the command line, type the following:

`python hello.py`

and observe the results.

- Remove the `)` from the print statement to cause a syntax error and
try to run the program again: observe how syntax errors are reported
by the python interpreter.

- Restore the `)` to the print statement and instead add a space before
the `print` and try to run the program again: observe how spacing is an
issue in python

### 3.1.2 Basics

We have provided another file, `basics.py` that demonstrates some of the
basics in python including libraries, variables, math, output formatting,
and command line arguments.  Open the file and read through it line by
line.  Run the script and provide it with a variety of command line arguments;
for example:

- `python basics.py`
- `python basics.py a b c d`
- `python basics.py 10 20.5 a b c d`

### 3.1.3 Editing a Script

We have provided a script, `birthday.py` that interactively prompts the
user for their birthdate (year, month, day) and computes how old they are.

- Run the program using your birthday (or some other date(s)) as example input
- Edit the script to use command line arguments instead of prompting the user
  interactively for input.  Use the `basics.py` code as an example.  Your
  script should be runnable as:

  `python birthday.py 1991 February 20`

  (this is python's birthday :)

### 3.1.4 Testing

Proper testing is an essential fundamental with software development.  Python
has a standard `unittest` package for unit testing functions.

- Run the `statistics_demo.py` script and provide a sequence of numbers
  as command line arguments as an ad-hoc test of the statistics functions in
  `statistics.py`.  For example:

  `python statistics_demo.py 10 20 30`

  Observe that the output is incomplete because two of the
  functions (`maximum()` and `sumVals()`) have not yet been implemented.

- Open an examine the contents of the `test_statistics.py` script file.  It
  defines a suite of unit tests for the two unimplemented functions.  Unit test
  functions begin with `test` and are automatically detected and run
  by Python's `unittest` framework.  To run the entire suite, run:

  `python test_statistics.py`

  It will run all unit tests and report any failures as well as a summary at
  the end.

- Open the `statistics.py` file and implement the two unimplemented functions.
  (`maximum()` and `sumVals()`).  Also write documentation for your two functions.
  Rerun your ad-hoc testing and the unit testing suite to ensure your
  implementations are correct.  Fix any bugs and continue to test until everything
  passes.

## 5. Submitting, & Grading your lab

Nearly all of your assignments will include a programming portion 
that will require you to hand in source files for graders to compile 
and evaluate. To do this, we use a web-based assessment app called 
codepost.io (<https://codepost.io>).

You should have received an invitation to this website from your 
instructor through your email account (typically your `@huskers.unl.edu` 
email or whatever email you have associated with on Canvas). If 
you have access, great. If not, go to <https://codepost.io/forgot-password> 
and "reset" your password (even if you never initially set one). Be 
sure to use your huskers email or whatever primary email is associated 
with your Canvas profile.

To handin and grade your lab, do the following.

1. Login to <https://codepost.io>.  It should immediately take you 
   to the assignment submission page.

2. For the relevant assignment click "Upload Assignment"

3. Upload the required files for the assignment.  For Lab 1.0, you'll
   need to upload the `statistics.py` source file.
   
4. Click "Submit and Run Tests".  A success dialog should be displayed, but
   **you are not yet done**.  
   
5. Click "View test results" to view the results of our tests and your grade.
   If there are problems or errors with your program(s), you should 
   fix/debug them and repeat the handin/grading process. You can do this 
   as many times as you like up until the due date.

***Congratulations on your first lab!***

