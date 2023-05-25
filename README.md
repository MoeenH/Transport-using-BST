# Transport-using-BST

## Bus Stop Service 
- The project consists of a search engine that utilizes three Data Structures, namely: Binary Trees, Linked List & Array.
- The user can access the Bus Stop lists sorted according to the distance from university in ascending order.
- Another feature would be the option to view all the routes of a particular Bus stop by entering it’s name via user input at run-time.
- The name, location, distance, & it’s routes are all stored accordingly. 
- Arrays are used in order to ensure that the user can access the routes of each bus stop via user input.
## BusNode 
- LEFT
- RIGHT
- NAME
- LOCATION
- DISTANCE
- Link List of Routes

## Usage of Array 
- After the InOrder traversal that prints out every single Bus Stop’s information, we have the option to access one of these to view it’s routes. 
- In order to ensure that the information is available even after the traversal is done, we place these Bus nodes within an array. We then take user input of any one number, and whatever number is entered, the bus stop corresponding to that number has it’s information displayed.

## Why BST ?
- The insertion & search of the binary tree yields more than satisfactory time complexity. 
- A Binary Tree would’ve worked for the route as well, but for the ease of implementation & because we knew the number of routes wouldn’t be particularly high, we used a LinkedList.
- We use a Binary Tree in order to store the Bus Nodes. A hashing table would’ve made it impossible to implement any sorting algorithms. A LinkedList’s time complexity would’ve been a major drawback.
- We utilize a LinkedList to store the routes. An array would’ve wasted memory since the number of routes is not pre-defined. 

## Complextity Analysis
| Function | O(N)     | 
| -------- | -------- | 
| InsertByDistance   | O(Log(N))|
| ArrayCreation   | O(1)     |
| InOrderTraversal   | O(N)     |

| Insert | O(N)     | 
| -------- | -------- | 
| ToString  | O(N) |
| Find   | O(N)     |

## Output 
![image1](https://github.com/MoeenH/Transport-using-BST/assets/57503695/47fc3e5f-d48b-40eb-b4c0-04ca7814d8db)
![image2](https://github.com/MoeenH/Transport-using-BST/assets/57503695/342df580-308c-4e58-91f9-3bba811668cd)

![img3](https://github.com/MoeenH/Transport-using-BST/assets/57503695/6557fb8b-e27e-4e4a-95a7-2ab754d18c17)
![img4](https://github.com/MoeenH/Transport-using-BST/assets/57503695/c0824692-86d3-4b9f-8ce4-2811777f12e8)


