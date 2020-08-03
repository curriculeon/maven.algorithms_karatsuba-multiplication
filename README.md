# Karatsuba Multiplication

* **Objective** - To create an algorithm to efficiently multiply numbers.
* **Purpose** - To gain familiarity the following features:
    * Big O Notation
    * Grade School addition
    * Iterative Multiplication
    * Recursive Multiplication
    * Karatsuba Multiplication
* **Description**
    * The purpose of this project is to create several implementations of multiplication as described in  Page 8 of Tim Roughgarden's `Algorithms Illuminates, Part 1: The Basics`.
    * The application should have an object-oriented representation of the pseudo-code described in the book and justify its claims of performance.


## Karatsuba Multiplication
* Given a 4 digit value composes two halves, compute the product of two 4 digit numbers by
    1. Split digits of each number to `a` and `b` 
        * Get first half of the 4 digit number, named `a`
        * Get second half of the 4 digit number named `b`
    2. Compute the product of `a` of first half and `a` of second half named `aProduct`
    3. Compute the product of `b` of first half and `b` of second half named `bProduct`
    4. Compute sum of `a` of first half and `b` of first half named `firstHalfSum`
    5. Compute sum of `a` of second half and `b` of second half named `secondHalfSum`
    6. Compute product of `firstHalfSum` and `secondHalfSum` named `productOfSumOfHalves`.
    7. Compute sum of `productOfSumOfHalves`, `-aProduct`, and `-bProduct` named `deltaOfProductOfSumOfHalves`
    8. Compute `10^digitLength/2^0 * aProduct + 10^digitLength/2^1 * deltaOfProductOfSumOfHalves +bProduct` as `product`.
     
           
  







## How to Download

#### Part 1 - Forking the Project
* To _fork_ the project, click the `Fork` button located at the top right of the project.


#### Part 2 - Navigating to _forked_ Repository
* Navigate to your github profile to find the _newly forked repository_.
* Copy the URL of the project to the clipboard.

#### Part 3 - Cloning _forked_ repository
* Clone the repository from **your account** into the `~/dev` directory.
  * if you do not have a `~/dev` directory, make one by executing the following command:
    * `mkdir ~/dev`
  * navigate to the `~/dev` directory by executing the following command:
    * `cd ~/dev`
  * clone the project by executing the following command:
    * `git clone https://github.com/MYUSERNAME/NAMEOFPROJECT`

#### Part 4 - Check Build
* Ensure that the tests run upon opening the project.
    * You should see `Tests Failed: 99 of 99 tests`







## How to Submit

#### Part 1 -  _Pushing_ local changes to remote repository
* from a _terminal_ navigate to the root directory of the _cloned_ project.
* from the root directory of the project, execute the following commands:
    * add all changes
      * `git add .`
    * commit changes to be pushed
      * `git commit -m 'I have added changes'`
    * push changes to your repository
      * `git push -u origin master`

#### Part 2 - Submitting assignment
* from the browser, navigate to the _forked_ project from **your** github account.
* click the `Pull Requests` tab.
* select `New Pull Request`