import React from "react";
import styles from "./CohortDetails.module.css";

function CohortDetails(props) {
    return (
        <div
            className={styles.box}
            style={{
                backgroundColor: props.cohort.currentStatus === "Ongoing"
                    ? "#d4edda"
                    : "#e2e3e5"
            }}
        >
            <h3
                style={{
                    color:
                        props.cohort.currentStatus === "Ongoing"
                            ? "green"
                            : "blue"
                }}
            >
                {props.cohort.cohortCode}
            </h3>

            <dl>
                <dt>Technology</dt>
                <dd>{props.cohort.technology}</dd>

                <dt>Current Status</dt>
                <dd>{props.cohort.currentStatus}</dd>

                <dt>Coach</dt>
                <dd>{props.cohort.coachName}</dd>

                <dt>Trainer</dt>
                <dd>{props.cohort.trainerName}</dd>
            </dl>
        </div>
    );
}

export default CohortDetails;