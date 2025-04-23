#include<iostream> 
#include<array> // implementation of the basic(or static) arrays.
#include<vector> 
#include<deque>
#include<list> 
#include<stack>
#include<queue> 
#include<set> 
#include<map> 
using namespace std; 

int main(){
	/*++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++ 1] STL ARRAYS+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++*/
	/*
	cout <<"This is STL tutorial for c++:"<< endl;
	int basic[3] = {1,2,3}; 
	array<int,4> a = {1,2,3,4}; 
	int size = a.size(); 
		for(int  i = 0; i < size; i ++){
			cout <<a[i]<<" ";
		}
	cout << endl;
	// methoods: 
	// 1] array.at(i):    gives the element which is present at that index i. 
	// 2] array.empty():  returns whether an array is empty or not. 
	// 3] array.front():  returns the first element of an array. 
	// 4] array.back():   returns the element which is present at last index of an array.
	*/
  /*+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++2] Vectors STL++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++*/
	/*
	// Adding elements  into the vector
	vector<int> x; 
	cout << "Capacity -> "<< x.capacity()<<endl; 
	vector<int> y(5,1); // 1 1 1 1 1 
		
	x.push_back(1); 
	cout << "Capacity -> "<< x.capacity()<<endl; 
	
	x.push_back(2); 
	cout << "Capacity -> "<< x.capacity()<<endl; 
	
	x.push_back(3); 
	cout << "Capacity -> "<< x.capacity()<<endl; 
	cout << "Size -> "<<x.size()<<endl; 
	cout << "element at index 2 is :"<<x.at(2)<<endl;	
	
	cout << "front "<< x.front()<<endl; 
	cout << "back "<<x.back()<<endl; 
	cout << "before pop" << endl; 
		
		for(int i:x){
			cout << i <<" "; 
		}	
		cout << endl; 
	
	x.pop_back(); // removes last element from vector 
		
	cout<<"After removing last element the array will be :"<<endl;
		for(int i:x){
			cout << i <<" ";
		}		
		cout << endl; 
	cout << "Before clear the size of the vector is :"<<x.size()<<endl; 
	x.clear();	
	cout << "After clear the size of the vector will be :"<<x.size()<<endl; // can never initialise to zero. 
	cout << "The capacity will be :"<<x.capacity()<<endl;
		
	vector<int> g1;
 
    	for (int i = 1; i <= 10; i++)
    	    g1.push_back(i * 10);
 	
 	   cout << "\nReference operator [g] : g1[2] = " << g1[2];
 	
 	   cout << "\nat : g1.at(4) = " << g1.at(4);
 	
 	   cout << "\nfront() : g1.front() = " << g1.front();
 	
 	   cout << "\nback() : g1.back() = " << g1.back();
 	
 	   // pointer to the first element
 	   int* pos = g1.data();
 	
 	   cout << "\nThe first element is " << *pos << endl;
	*/	
	/*+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++3] Deque++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++*/	
	/*
		deque <int> d; 
		d.push_back(1); 
		d.push_front(2);
			for(int n:d){
				cout << n << " ";
			}
			
			cout << endl; 
	
		cout << "Print the First indexed element -> "<<d.at(1)<<endl;  
		cout << "Front "<<d.front()<<endl;
		cout << "back "<<d.back()<<endl; 	
		cout << "Empty or Not :" << d.empty()<<endl; 
		d.erase(d.begin(),d.begin() + 1);
		cout << "The size of an deque after erasing will be :" << d.size()<<endl;  
		
			for(int n:d){
				cout << n << " ";
			}
			
			cout << endl; 
	*/ 		
	/*++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++4] List ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++*/ 
	/*
	list <int> l1(5,100); 
	l1.push_front(2);
	l1.push_back(1); 
	l1.erase(l1.begin());		
	cout<<"After Erase :" << endl; 
			for(int n:l1){
				cout << n << " ";
			}
			
			cout << endl; 
	cout << "After erase the size of the list is :" << l1.size() << endl; 	
	*/ 
	
	/*++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++ 5] Stack ++++++++++++++++++++++++++++++*/ 
	// LIFO 
	/*
	stack<string> s; 
	s.push("Dr fate"); 
	s.push("Dr Strange");
	s.push("Scarlet Witch"); 
	s.push("Dr Manhattan"); 
	s.push("Dr Supreme Strange"); 
	cout << "Top element is :" << s.top() << endl;
    cout << "The size of the stack is : "<< s.size() << endl; 
    */ 
    /*+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++ 6] Queue ++++++++++++++++++++++++++++++++*/ 
    /*
    cout << "I am a Batman, I am Vengence !"<< endl; 
    cout << "Bokada Kirada !" << endl; 
    queue <string> s; 
    s.push("sairaj"); 
    s.push("Utkarsh"); 
    s.push("Vilas"); 
    s.push("Manas"); 
    s.push("Tushar"); 
    s.push("Swaraj"); 
    cout << "First element :"<<s.front() << endl; 
    cout << "Size :" << s.size() << endl; // total number of element 
    // pop() is same for other STL componenets. 
    */ 
    
    
    /*++++++++++++++++++++++++++++++++++++++++++++++++++++ 7] Priority Queue +++++++++++++++++++++++++++++++*/ 
    /*
    cout << "I am a Batman, I am Vengence !"<< endl; 
    cout << "Bokada Kirada !" << endl; 
    // max- heap 
    priority_queue<int> max_heap;  // based on max-heap 
    // min-heap 
    priority_queue <int,vector<int>,greater<int> > min_heap; 
    max_heap.push(1); 
    max_heap.push(2); 
    max_heap.push(3); 
    max_heap.push(0); 
    int n = max_heap.size();
    for (int i = 0; i < n ; i++) {
        
        cout << max_heap.top() <<" "; 
        max_heap.pop(); //3  2  (returns maximum element ). 
    }
    cout << endl; 
    
    min_heap.push(5); 
    min_heap.push(4); 
    min_heap.push(3); 
    min_heap.push(2); 
    min_heap.push(1); 
    min_heap.push(0); 
    min_heap.push(7); 
    min_heap.push(-1); 
    
    cout << "Khali hai kya bhai ?" << min_heap.empty() << endl;     
    cout << "Bokada Gaska" << endl; 
    */ 
    
    /*++++++++++++++++++++++++++++++++++++++++++++++++++++8] Set+++++++++++++++++++++++++++++++++++*/
    /*
    set<int> s; // inserts element in sorted order. 
    s.insert(1); 
    s.insert(1);
    s.insert(1); 
    s.insert(2); 
    s.insert(3); 
    s.insert(4); 
    s.insert(4); 
    s.insert(5); 
    s.insert(6); 
    s.insert(7); 
    s.insert(7); 
    s.insert(0); 
    
    for(auto i : s){
        cout << i << " "; 
    }
    cout <<  endl; 
    
    set<int> :: iterator it = s.begin(); 
    it ++; 
    s.erase(it); // removes 1 
    
    for(auto it : s){
        cout << it << " "; 
    }
    cout << endl; 
    set<int> :: iterator itr = s.find(5); 
    cout << " Value present at itr -> :" << *itr << endl; 
    
    for(auto i = itr ; i != s.end() ; i ++){
        cout << *i << " "; 
    }
    
    cout << endl; 
    */ 
    /*++++++++++++++++++++++++++++++++++++++++++++++++++7] Map ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++*/ 
    // stores value in key-value form 
    // each key is unique 
    // same key can't pointed to more than one values but  vice-versa is true. 
    map<int,string> m; 
    m[1] = "sairaj fate"; 
    m[2] = "Sai knight"; 
    m[3] = "Sai thor"; 
    m[4] = "Bat Sai"; 
    m[5] = "Spider-Sai"; 
    m[6] = "Super Sai"; 
    m[7] = "Sairaj Strange"; 
    cout << "Before erase :" << endl; 
            for(auto a : m){
                cout << a.first<<" " << a.second << endl; 
            }
    cout << endl; 
    cout << "After erase :" << endl; 
    m.erase(7); 
            for(auto a : m){
                cout << a.first<<" " << a.second << endl; 
            }
    // insertion/deletion/count --- > O(logN).(Ordered Map). 
    // Time Complexity is O(1) in case of the unsorted Map. 
    
}























