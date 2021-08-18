# 202012020_Lab01_Poll_Simulator

**JSP Pages - Presentation Layer**  
index.jsp - It is a Home page that contains links to all other pages  
registerCandidate.jsp - It contains candidate registration form with input fields- candidate ID and candidate name   
giveVote.jsp - It contains a form that includes student id and list of candidates as input fields.It allows students to vote for their desired candidates only once.  
pollResult.jsp - The result of voting is presented here   
votingSummary.jsp - displays voting report for all candidates  
message.jsp - displays success/failure messages after each candidate registration and voting  

**Model - declares the classes, variables and their getter and setter methods**  
Candidate - contains ID, name and vote_count as its fields  
Student - contains student ID as its member field  

**Servlets - Controller:- Passes data between the presentation layer and application layer**  
CandidateServlet - fetches candidate details from the candidate registration form, sets these details to candidate object and passes them to CandidateService  
VotingServlet - fetches student and candidate IDs from the giveVotes.jsp page, passes these to StudentService and CandidateService respectively.  

**Service - Application Layer**  
CandidateService - Maintains a list of candidates and has candidate registration method, get Poll result method and vote registration method.  
StudentService - Keeps a track of students who have voted for the poll  
