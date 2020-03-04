package com.capg.onlinetestapp.dao;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import com.capg.onlinetestapp.entities.Questions;
import com.capg.onlinetestapp.entities.Test;
import com.capg.onlinetestapp.entities.User;

public class UserDaoImp implements IUserDao {

@Override
public Test addTest(Test test) {
DataStore.add(test);
return test;
}

@Override
public Questions addQuestions(BigInteger testId, Questions question) {
Test test = DataStore.getTestById(testId);
Set<Questions> questionSet = test.getTestQuestions();
if (questionSet == null) {
questionSet = new HashSet<Questions>();
test.setTestQuestions(questionSet);
}
questionSet.add(question);
return question;
}

@Override
public Questions deleteQuestions(BigInteger testId, Questions question) {
Test test = DataStore.getTestById(testId);
Set<Questions> questionSet = test.getTestQuestions();
        questionSet.remove(question);
return question;
}

@Override
public boolean assignTest(Long userId, BigInteger testId) {
User user=DataStore.userStore.get(userId);
Test test = DataStore.getTestById(testId);
user.setUserTest(test);
return true;
}

@Override
public Test deleteTest(BigInteger testId) {
Test test = DataStore.getTestById(testId);
DataStore.testStore.remove(testId);
return test;
}

@Override
public Questions updateQuestions(BigInteger testId, Questions question) {
question.setQuestionAnswer(question.getQuestionAnswer());
question.setQuestionMarks(question.getQuestionMarks());
question.setQuestionOptions(question.getQuestionOptions());
question.setChosenAnswer(question.getChosenAnswer());
question.setMarksScored(question.getMarksScored());
return question;
}

@Override
public Test updateTest(BigInteger testId, Test test) {
test.setTestId(test.getTestId());
test.setTestTitle(test.getTestTitle());
test.setTestTotalMarks(test.getTestMarksScored());
test.setCurrentQuestion(test.getCurrentQuestion());
test.setTestDuration(test.getTestDuration());
test.setTestQuestions(test.getTestQuestions());
test.setStartTime(test.getStartTime());
test.setEndTime(test.getEndTime());
return test;
}

@Override
public BigDecimal getResult(Test test) {
BigDecimal totalMarks = new BigDecimal(0);
HashSet<Questions> questions = (HashSet<Questions>) test.getTestQuestions();
Iterator<Questions> it = questions.iterator();
while (it.hasNext()) {
Questions question = it.next();
totalMarks = totalMarks.add(question.getMarksScored());
}
return totalMarks;
}

public void assign(Long userId, BigInteger TestId) {

}

}