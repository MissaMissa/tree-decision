package tprlab7;

// DECISION TREE  APPLICATION
// Frans Coenen
// Thursday 15 August 2002
// Department of Computer Science, University of Liverpool

import java.io.*;

class DecisionTreeApp {

    /* ------------------------------- */
    /*                                 */
    /*              FIELDS             */
    /*                                 */
    /* ------------------------------- */

    static BufferedReader keyboardInput = new
                           BufferedReader(new InputStreamReader(System.in));
    static DecisionTree newTree;

    /* --------------------------------- */
    /*                                   */
    /*               METHODS             */
    /*                                   */
    /* --------------------------------- */

    /* MAIN */

    public static void main(String[] args) throws IOException {

        // Create instance of class DecisionTree

        newTree = new DecisionTree();

        // Generate tree

        generateTree();

        // Output tree

        System.out.println("\nOUTPUT DECISION TREE");
        System.out.println("====================");
        newTree.outputBinTree();

        // Query tree

        queryTree();
        }

    /* GENERATE TREE */

    static void generateTree() {
        System.out.println("\nGENERATE DECISION TREE");
        System.out.println("======================");
        newTree.createRoot(1,"Do u want gamer notebook?");
        newTree.addYesNode(1,2,"Will u play last games?");
        newTree.addNoNode(1,3,"Will u go with this noteboock often?");
        newTree.addYesNode(2,4,"U need powerfool notebook with i7 proc 8 or more OM and 2Gig or more video m");
        newTree.addNoNode(2,5,"U need powerfool notebook with i5 proc 4 OM and 1G v.mem");
        newTree.addYesNode(3,6,"U need ultrabook wich wight less then 2 kilo and working like 8hours");
        newTree.addNoNode(3,7,"U need common notebook without any cool things");
        }

    /* QUERY TREE */
	
    static void queryTree() throws IOException {
        System.out.println("\nQUERY DECISION TREE");
        System.out.println("===================");
        newTree.queryBinTree();

        // Option to exit

        optionToExit();
        }

    /* OPTION TO EXIT PROGRAM */

    static void optionToExit() throws IOException {
        System.out.println("Exit? (enter \"Yes\" or \"No\")");
        String answer = keyboardInput.readLine();
        if (answer.equals("Yes")) return;
        else {
            if (answer.equals("No")) queryTree();
            else {
                System.out.println("ERROR: Must answer \"Yes\" or \"No\"");
                optionToExit();
                }
            }
        }
    }