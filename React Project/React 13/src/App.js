import './App.css';
import BookDetails from "./Components/BookDetails";
import BlogDetails from "./Components/BlogDetails";
import CourseDetails from "./Components/CourseDetails";
function App() {
  const showBooks = true;
  const showBlogs = true;
  const showCourses = true;
  return (
      <div className={"container"}>
        {showBooks && <BookDetails />}
        {showBlogs ? <BlogDetails /> : null}
        {showCourses ? <CourseDetails /> : null}
      </div>
  );
}

export default App;
