import "./Home.css";
import "bootstrap/dist/css/bootstrap.min.css";
import "bootstrap/dist/js/bootstrap.bundle.min";

function Home() {

    const travelbuddy_1 = "https://picsum.photos/900/400?random=1";
    const travelbuddy_2 = "https://picsum.photos/900/400?random=2";
    const travelbuddy_3 = "https://picsum.photos/900/400?random=3";
    const travelbuddy_8 = "https://picsum.photos/450/300?random=8";
    const travelbuddy_9 = "https://picsum.photos/450/300?random=9";

    return (
        <div>
            <br />

            <center>
                <h1>Travel Buddy</h1>
                <h6>- Find your travel partner!</h6>
            </center>

            <button className="btn btn-primary lbs">
                <a className="textbl" href="/l">
                    Login
                </a>
            </button>

            <button className="btn btn-outline-primary sbs">
                <a className="textbs" href="/s">
                    Sign Up
                </a>
            </button>

            <br />
            <br />

            <div
                id="carouselExampleAutoplaying"
                className="carousel slide"
                data-bs-ride="carousel"
                data-bs-interval="2000"
            >
                <div className="carousel-inner">

                    <div className="carousel-item active">
                        <center>
                            <img
                                src={travelbuddy_1}
                                className="d-block ics"
                                alt="Travel Buddy"
                            />
                        </center>
                    </div>

                    <div className="carousel-item">
                        <center>
                            <img
                                src={travelbuddy_2}
                                className="d-block ics"
                                alt="Travel Buddy"
                            />
                        </center>
                    </div>

                    <div className="carousel-item">
                        <center>
                            <img
                                src={travelbuddy_3}
                                className="d-block ics"
                                alt="Travel Buddy"
                            />
                        </center>
                    </div>

                </div>

                <button
                    className="carousel-control-prev"
                    type="button"
                    data-bs-target="#carouselExampleAutoplaying"
                    data-bs-slide="prev"
                >
                    <span className="carousel-control-prev-icon"></span>
                </button>

                <button
                    className="carousel-control-next"
                    type="button"
                    data-bs-target="#carouselExampleAutoplaying"
                    data-bs-slide="next"
                >
                    <span className="carousel-control-next-icon"></span>
                </button>

            </div>

            <br />

            <p className="hpes">
                Individuals often want to travel during their holidays but
                struggle to find someone to accompany them. Travel Buddy
                connects people travelling to the same destination, allowing
                them to share experiences, expenses and make new friends while
                exploring the world.
            </p>

            <h4 className="hpes">
                We Got Your Problem
            </h4>

            <p className="hpes">
                Travel Buddy provides a platform where solo travellers can find
                companions travelling to similar destinations. The application
                also offers optional tour guides, volunteers, rental cars and
                drivers to make every trip safer and more enjoyable.
            </p>

            <br />

            <center>

                <h4>How does Travel Buddy work?</h4>

                <table>
                    <tbody>
                        <tr>

                            <td>
                                <img
                                    className="hdtbis"
                                    src={travelbuddy_8}
                                    alt="How Travel Buddy Works"
                                />
                            </td>

                            <td>
                                <center>
                                    <h5>The Process of Travel Buddy</h5>
                                </center>

                                <img
                                    className="tpotbis"
                                    src={travelbuddy_9}
                                    alt="Travel Buddy Process"
                                />
                            </td>

                        </tr>
                    </tbody>
                </table>

            </center>

            <br />

            <div className="hpes">
                We also hire Volunteers, want to join as a Volunteer?
                <a className="chl" href="/v">
                    Click Here →
                </a>
            </div>

            <br />

            <center className="aues">
                <h4>About Us</h4>
                Mohammad Shariq Ali
                <br />
                Jatroth Shiva
                <br />
                Nakka Shiva
            </center>

        </div>
    );
}

export default Home;