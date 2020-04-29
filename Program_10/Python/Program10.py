import sys
import os

def osInterigation(pathVar):
        print("Os Interigation Program:")

        # Display the Path String
        print("Current PATH variables")
        print(os.environ.get('PATH'))

        # slice variable
        searchItem = pathVar[1]
        
        print("Currently Looking for " + searchItem)
        
        currentPATH = os.environ.get('PATH')
        listOfElements = currentPATH.split(':' )
        for i in range(0, listOfElements.__len__() - 1):
            directoryIndex = listOfElements[i] 
            # print(directoryIndex)
            
                    
        
        
        
pathSearch = sys.argv
osInterigation(pathSearch)