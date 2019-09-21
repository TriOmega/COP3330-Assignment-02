package osorio_p3;

import java.util.Scanner;

public class Polling {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		String[] topics = {"Theatre", "Video Games", "Music", "Movies", "Books"};
		int[][] responses = new int[5][10];
		int endPolling = 0;
		int i, j;
		int ratingInput;
		int topicSum;
		int numPeoplePolled = 0;
		int maxTopic = -1, maxSum = 0, minTopic = -1, minSum = 10000;
		
		System.out.println("Please rate each topic you see on a scale of 1 (least important) to 10 (most important):");
		while(endPolling == 0) {
			for (i = 0; i < topics.length; i++) {
				ratingInput = -1;
				while (!((ratingInput >0) && (ratingInput <= 10))) {
					System.out.println("Rate " + topics[i] + " below:");
					ratingInput = scnr.nextInt();
					if (!((ratingInput >0) && (ratingInput <= 10))) {
						System.out.printf("Invalid Input. Try Again.\n\n");
					}
				}
				responses[i][ratingInput-1]++;
			}
			numPeoplePolled++;
			System.out.println("");
			System.out.println("Would another user like to take the poll?");
			System.out.println("If \"Yes\" enter 0. If \"No\" enter any other whole number.");
			endPolling = scnr.nextInt();
			System.out.println("");
		}
		System.out.printf("\t\t1\t2\t3\t4\t5\t6\t7\t8\t9\t10\tAvg\n");
		for(i = 0; i < topics.length; i++) {
			topicSum = 0;
			if (i == 1) {
				System.out.printf("%s", topics[i]);
			} else {
				System.out.printf("%s\t", topics[i]);
			}
			for(j = 0; j < 10; j++) {
				if (j == 9) {
					topicSum += (responses[i][j] * (j + 1));
					if (topicSum > maxSum) {
						maxSum = topicSum;
						maxTopic = i;
					}
					if (topicSum < minSum) {
						minSum = topicSum;
						minTopic = i;
					}
					System.out.printf("\t%d\t%.0f\n", responses[i][j], ((double) topicSum)/numPeoplePolled);
				} else {
					topicSum += (responses[i][j] * (j +1));
					System.out.printf("\t%d", responses[i][j]);
				}
			}
		}
		System.out.println("");
		System.out.println("Highest Point Topic:");
		System.out.println(topics[maxTopic] + " with " + maxSum + " points.");
		
		System.out.println("");
		System.out.println("Lowest Point Topic:");
		System.out.println(topics[minTopic] + " with " + minSum + " points.");
	}

}
