package NumberGenerator.domain;

public class PuzzleNumber {
    private final static int MIN_Puzzle_Num =1;
    private final static int MAX_Puzzle_Num =8;

    private int puzzleNum;
    public PuzzleNumber(int puzzleNum){
        checkPuzzleRange(puzzleNum);
        this.puzzleNum =puzzleNum;
    }

    private void checkPuzzleRange(int puzzleNum) {
        if(puzzleNum<MIN_Puzzle_Num || puzzleNum>MAX_Puzzle_Num){
            throw new IllegalStateException("퍼즐 숫자 범위는 1부터 9까지 입니다.");
        }
    }


}
